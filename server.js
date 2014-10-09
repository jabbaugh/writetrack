var MongoClient = require('mongodb').MongoClient;
var dbhost = 'mongodb://localhost:27017/account',
    userCollection = 'user';

var express = require('express'),
    config = require('./server/configure'),
    app = express();

app = config(app);
app.set('port', process.env.PORT || 3300);
app.set('views', __dirname + '/views');
app.get('/', function(req, res) {
    res.send('Hello World');
});

var server = app.listen(app.get('port'), function(){
    console.log('Server up: http://localhost:' + app.get('port'));
});
