// config/auth.js

// expose our config directly to our application using module.exports
module.exports = {

    'facebookAuth' : {
        'clientID'      : '781407541949009', // your App ID
        'clientSecret'  : 'ec0031e64f6cbd65d143a2d1e98fe05e', // your App Secret
        'callbackURL'   : 'http://localhost:8080/auth/facebook/callback'
    }
};

