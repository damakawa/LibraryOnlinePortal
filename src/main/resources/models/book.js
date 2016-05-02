var mongoose = require('mongoose');

var Schema = mongoose.Schema;

var BooksSchema = new Schema({
	title : String,
	authorLName: String,
   	authorFName: String,
   	yearOfPublication : String,
   	publisher: String
   },

   {collection : 'books'});

module.exports = mongoose.model('Book', BooksSchema);
