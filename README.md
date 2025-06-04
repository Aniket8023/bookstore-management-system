📚 Bookstore Management System API

A Spring Boot-based bookstore management API that allows users to manage books and authors efficiently. It includes features like CRUD operations, database integration, and basic security authentication.

📚 Book APIs Endpoints

📝 GET /books

Description: Fetch all available books in the system.

Response: ✔ 200 OK – Returns list of all books

![Get books](https://github.com/user-attachments/assets/26731a92-444c-43a4-8373-9cc9f2b107b6)



📝 GET /books/{id}

Description: Fetch a specific book by its ID.

Response: ✔ 200 OK – Book found

![Get a single book by id](https://github.com/user-attachments/assets/b7909b41-5932-4d52-aa49-acd278b183d8)


📝 POST /books

Description: Add a new book to the bookstore.

Request Body Example:

{

    "title": "Spring Boot Guide",
    
    "description": "Complete guide on Spring Boot",
    
    "price": 599.0,
    
    "publishedDate": "2025-06-01",
    
    "author": {
        "id": 1
    }
    
}

Response:

{

    "message": "Book added successfully!"
    
}

![Add new book](https://github.com/user-attachments/assets/ae099a78-9f51-467a-9521-73a1a3c333ef)


📝 PUT /books/{id}

Description: Update an existing book's details.

Path Variable: id – Book ID

Request Body Example:

{

  "title": "Effective Java - 2nd Edition",
  
  "description": "Updated edition of Effective Java",
  
  "price": 500.00,
  
  "publishedDate": "2018-05-10",
  
  "author": {
    "id": 2
  }
  
}

Response: ✔ 200 OK – Book updated

![Update a book](https://github.com/user-attachments/assets/b030164f-db6e-4cb0-8ede-e382db372197)


❌ DELETE /books/{id}

Description: Delete a book from the bookstore.

Path Variable: id – Book ID

Response: ✔ 200 OK – "Book deleted successfully!"

![Book delete](https://github.com/user-attachments/assets/7bee41d9-d528-463d-b15b-4ec8fb8e5606)



✍️ Author APIs

📝 GET /authors

Description: Fetch all authors available in the system.

Response: ✔ 200 OK – Returns list of all authors

![List author](https://github.com/user-attachments/assets/2e46fc75-9673-4735-b02f-afac0a8ac8db)



📝 POST /authors

Description: Add a new author to the database.

Request Body Example:

{

  "name": "Jhon",
  
  "bio": "Expert in Microservices and Cloud Computing",
  
  "dateOfBirth": "1995-08-14"
  
}

Response: ✔ 201 Created – Author added successfully

![Add author](https://github.com/user-attachments/assets/9af781a1-d147-47fe-8479-aee75aa2a249)

