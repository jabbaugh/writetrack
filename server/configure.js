var connect = require('connect'),
    path = require('path'),
    exphbs = require('express-handlebars');

module.exports = function(app) {
    app.engine('hbs', exphbs.create({
        defaultLayout: 'main',
        layoutsDir: app.get('views') + '/layouts',
        partialsDir: [app.get('views') + '/parties']
    }).engine);

    app.set('view engine', 'hbs');

/*    app.use(morgan('dev'));
    app.use(connect.bodyParser({
        uploadDir:path.join(__dirname, '../public/upload/temp')
    }));
    app.use(connect.json());
    app.use(connect.urlencoded());
    app.use(connect.methodOverride());
    app.use(connect.cookieParser('some'));
    app.use(connect.router);
    app.use('/public/', connect.static(path.join(__dirname, '../public')));

    if ('development' === app.get('env')) {
        app.use(connect.errorHandler());
    };
*/

    return app;
};
