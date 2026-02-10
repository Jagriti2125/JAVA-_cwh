# JAVA-_cwh
a code repository for java series

☕ Java Project Setup using GitHub Codespaces

This repository demonstrates a real-world Java project setup using GitHub Codespaces.
It shows how to configure a clean Java development environment in the cloud, handle common tooling issues, and follow professional Git practices.

This setup is reproducible, beginner-friendly, and industry-aligned.

🚀 What This Project Covers

Creating a Java project using GitHub + Codespaces

Setting up Java without local installation

Using a Dev Container for a consistent environment

Writing, compiling, and running Java code

Proper Git hygiene (.gitignore)

Handling real-world issues like Git LFS errors

Committing and pushing clean code to GitHub

📂 Project Structure
JAVA-_cwh/
├── .devcontainer/
│   └── devcontainer.json
├── src/
│   └── Main.java
├── .gitignore
└── README.md

🛠️ Prerequisites

You only need:

A GitHub account

A modern web browser

❌ No need to install Java
❌ No need to install VS Code locally

Everything runs in the cloud using GitHub Codespaces.

⚙️ Step-by-Step Setup Guide
1️⃣ Create the GitHub Repository

Go to GitHub

Create a new repository

Add a README.md

Make the repository public (recommended for learning)

2️⃣ Open the Repository in Codespaces

Open your repository on GitHub

Click Code → Codespaces

Select Create codespace on main

This opens a cloud-based VS Code environment with terminal support.

3️⃣ Java Environment Setup (Dev Container)

Codespaces does not always include Java by default.
Instead of installing Java manually, this project uses a Dev Container.

.devcontainer/devcontainer.json
{
  "name": "Java Codespace",
  "image": "mcr.microsoft.com/devcontainers/java:17",
  "customizations": {
    "vscode": {
      "extensions": [
        "vscjava.vscode-java-pack"
      ]
    }
  }
}

Steps:

Create a .devcontainer folder

Add devcontainer.json with the above content

Rebuild the container:

Click Codespaces → Rebuild Container

After rebuild, Java is available automatically.

4️⃣ Verify Java Installation

Run in terminal:

java -version


Expected output:

openjdk version "17"

5️⃣ Create Java Source Code
File: src/Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Codespaces Java ☕");
    }
}

6️⃣ Compile and Run the Program
cd src
javac Main.java
java Main


Expected output:

Hello from Codespaces Java ☕

🧠 Understanding Java Execution

.java → source code

javac → compiles source into .class

.class → bytecode executed by the JVM

.class files are generated, not written by the developer

🚫 Ignoring Build Files (.gitignore)

Generated .class files should not be committed.

.gitignore
*.class


This ensures only source code is tracked by Git.

🔧 Handling Git LFS Issue (Important)

While pushing, Git may fail with a Git LFS error:

git-lfs was not found on your path

Why this happens:

GitHub sometimes enables Git LFS hooks

Java source code does not require Git LFS

Fix:

Remove the LFS pre-push hook:

rm -f .git/hooks/pre-push


Then push again:

git push origin main

📦 Git Workflow Used
git add .
git commit -m "Initial Java setup with Codespaces and Hello World"
git push origin main


This ensures:

Clean history

Clear intent

Professional commit message

✅ Why This Setup Is Professional

Cloud-based, reproducible environment

No dependency on local machine setup

Proper Java project structure

Correct handling of generated files

Real-world Git troubleshooting experience

🧾 One-Line Summary

This project demonstrates a clean Java setup using GitHub Codespaces and Dev Containers, covering environment configuration, Java compilation, Git best practices, and real-world issue handling.

📌 Who Is This For?

Beginners learning Java

Students preparing for internships

Anyone wanting a clean Java + GitHub workflow

Developers tired of “works on my machine” problems

☕ Happy Coding!

If you found this helpful, feel free to fork the repository and build on it 🚀