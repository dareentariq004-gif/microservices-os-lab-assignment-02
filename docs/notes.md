# Docker and GitHub Notes

## 1. Biggest Docker Challenges

During the Docker setup, I faced two main challenges:

### Challenge 1: Internet Connection Issues

One of the biggest challenges was downloading the required files and Docker base image because of internet connection interruptions.

**Solution:**

I solved this problem by:
- Building the Spring Boot application locally using Gradle.
- Generating the executable JAR file before building the Docker image.
- Downloading the required Docker base image separately.
- Building the Docker image using the locally generated JAR file.

After these steps, the Docker image was built successfully, and the Customer Service container started running.

### Challenge 2: Port Conflict

Another challenge was that port 7777 was not available on the host machine.

**Solution:**

I solved this issue by mapping host port 7778 to container port 7777 using Docker:

`-p 7778:7777`

This allowed the application to run successfully inside the container while accessing it through port 7778 on the host machine.

I verified the application using Postman by sending a GET request to:

`http://localhost:7778/customers`

The API returned a successful HTTP 200 OK response.

## 2. Key GitHub Lesson

The most important lesson I learned about GitHub was how to manage a project using Git and a remote repository.

I learned how to:
- Initialize a Git repository.
- Create a `.gitignore` file to exclude unnecessary files and folders.
- Stage only the required project files.
- Write meaningful commit messages.
- Push commits to a GitHub repository.
- Keep the repository organized and avoid uploading unrelated files.

For example, I used the following commit message when adding the README file:

`docs: add project README`

This message clearly describes the purpose of the commit.

This experience helped me understand the importance of version control and maintaining a clean, professional project repository.