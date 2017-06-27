/*
 * In order to test modifications to this library work, after installing them
 * run this file, e.g.
 *
 * > node sanity_test.js
 *
 * It should print something like this:
 *
 *  Success!
 *  [ { uploadUrl: 'https://streetviewpublish.googleapis.com/media/user/12345/photo/67890' } ]
 */

var client = require("streetview-publish-client-libraries-v1").v1({});
client.startUpload({}).then(function(responses) {
  console.log("Success!");
  console.log(responses);
}).catch(function(error) {
  console.log("Error occurred!");
  console.log(error);
});
