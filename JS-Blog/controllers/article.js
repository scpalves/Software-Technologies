const Article = require('mongoose').model('Article');

module.exports = {
    createGet: (req, res) => {
        res.render('article/create')
    },
    createPost: (req, res) => {
        let articleArgs = req.body;

        let errMsg = '';

        if (!req.isAuthenticated()) {
            errMsg = 'You should be logged in to make articles!';
        } else if (!articleArgs.title) {
            errMsg = 'Invalid title!';
        } else if (!articleArgs.content) {
            errMsg = 'Invalid content!';
        }

        if (errMsg) {
            res.render('article/create', {error: errMsg});
            return;
        }

        articleArgs.author = req.user.id;
        Article.create(articleArgs).then(article => {
            req.user.articles.push(article.id);
            req.user.save(err => {
                if (err) {
                    res.render('/', {error: err.message});
                } else {
                    res.redirect('/');
                }
            })
        })
    },
    details: (req, res) => {
        let id = req.params.id;

        Article.findById(id).populate('author').then(article => {
            res.render('article/details', article);
        })
    },
    deleteGet: (req, res) => {
        if(!req.isAuthenticated()){
            res.redirect('/user/login');
        } else {
            let id = req.params.id;
            Article.findByIdAndRemove(id).then(article => {
                if(article){
                    res.redirect('/');
                }});
        }
    },
    editGet: (req, res) => {
        let id = req.params.id;
        Article.findById(id).then(article => {
            if (article) {
                res.render('article/edit', article);
            } else {
                res.redirect('/');
            }
        }).catch(err => res.redirect('/'));
    },
    editPost: (req, res) => {
        let id = req.params.id;
        let newArticle = req.body;

        Article.findByIdAndUpdate(id, newArticle).then(article => {
            res.redirect('/');
        })

    }
};