📚 Bookstore Management System API

A Spring Boot-based bookstore management API that allows users to manage books and authors efficiently. It includes features like CRUD operations, database integration, and basic security authentication.

📚 Book APIs Endpoints

📝 GET /books

Description: Fetch all available books in the system.

Response: ✔ 200 OK – Returns list of all books

![Get books](https://github.com/user-attachments/assets/6392d407-404c-4298-9088-b83390385fa2)


📝 GET /books/{id}

Description: Fetch a specific book by its ID.

Response: ✔ 200 OK – Book found

![Get a single book by id](https://github.com/user-attachments/assets/f8a156aa-51f0-4875-bcac-34e1671e5dc5)

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

![Add new book](https://github.com/user-attachments/assets/c49e937b-8b53-4e6b-8ed8-f173f7ad1c85)

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

![Update a book](https://github.com/user-attachments/assets/161e8886-9612-442f-bce2-0983682583f5)

❌ DELETE /books/{id}

Description: Delete a book from the bookstore.

Path Variable: id – Book ID

Response: ✔ 200 OK – "Book deleted successfully!"

![Book delete](https://github.com/user-attachments/assets/8bfa6cf9-2712-42e1-9110-65b60e35c815)


✍️ Author APIs

📝 GET /authors

Description: Fetch all authors available in the system.

Response: ✔ 200 OK – Returns list of all authors

![List author](https://github.com/user-attachments/assets/9ab22806-e463-4962-ac79-930b15d4be82)


📝 POST /authors

Description: Add a new author to the database.

Request Body Example:
{
  "name": "Jhon",
  "bio": "Expert in Microservices and Cloud Computing",
  "dateOfBirth": "1995-08-14"
}

Response: ✔ 201 Created – Author added successfully

![Add author](https://github.com/user-attachments/assets/0bf5ad1b-a20b-48f1-8276-0b3c311168e2)
