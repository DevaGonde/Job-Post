# Job Posting API

## Overview
This API allows users to add, fetch, and search job postings. It is built using Spring Boot and MongoDB Atlas.

## Features
- **Add Job**: Add a new job posting.
- **Fetch Jobs**: Retrieve all job postings.
- **Search Jobs**: Search jobs based on job description, required experience, profile, and skillset.

## Prerequisites
- Java 11 or higher
- Maven
- MongoDB Atlas account
- Spring Boot

## Getting Started

### Clone the Repository
```bash
git clone https://github.com/yourusername/job-posting-api.git
cd job-posting-api
````
## Configure MongoDB Atlas
1. Create a MongoDB Atlas account and cluster.
2. Create a database named JobDB.
3. Create a collection named jobPostings.
4. Obtain your MongoDB connection string.
## Setup Application
1. Open the project in your favorite IDE.
2. Navigate to src/main/resources/application.properties.
3. Add your MongoDB connection string:
   
```bash
spring.data.mongodb.uri=mongodb+srv://<username>:<password>@<cluster-url>/JobDB?retryWrites=true&w=majority
````
## Running the Application
1. Open a terminal in the project directory.
2. Run the following command to build and start the application

````bash
mvn spring-boot:run
````
3. The API will be accessible at http://localhost:8080.

# API Endpoints
## Add Job
- URL: /AddJob
- Method: POST
- Description: Adds a new job posting.
- Request Body: JSON object containing job details.
## Fetch Jobs
- URL: /GetAll
- Method: GET
- Description: Retrieves all job postings.
## Search Jobs
- URL: /Search/{searchedText}
- Method: GET
- Description: Searches for jobs based on a text search.
- Path Variable: searchedText - the text to search for in job postings.
## Get Job by ID
- URL: /{id}
- Method: GET
- Description: Retrieves a job posting by its ID.
- Path Variable: id - the ID of the job posting.
# Example Usage
- To add a job posting, send a POST request to http://localhost:8080/AddJob with a JSON body containing the job details.
- To fetch all job postings, send a GET request to http://localhost:8080/GetAll.
- To search for jobs, send a GET request to http://localhost:8080/Search/{searchedText} with the search text as a path variable.
- To get a job posting by ID, send a GET request to http://localhost:8080/{id} with the job ID as a path variable.
# Deployment
If you wish to deploy the application:

1. Ensure your MongoDB Atlas cluster is accessible from the deployment environment.
2. Configure the application.properties with the appropriate MongoDB URI.
3. Package the application using Maven

````bash
mvn clean package
````
4. Deploy the generated .jar file to your server.
# Author
- Devendra Gonde
- Contact: +91 9119547554
- Email: devendragonde1221@gmail.com
- LinkedIn: linkedin.com/in/devendragonde
- GitHub: github.com/DevaGonde
# Repository
- GitHub Repository: https://github.com/DevaGonde/job-post.git
# Important Notes
- Ensure your MongoDB Atlas cluster is properly configured and accessible.
- Update the MongoDB connection string in the application.properties file before running the application.
- Test the API endpoints using tools like Postman or curl to ensure they work as expected.




