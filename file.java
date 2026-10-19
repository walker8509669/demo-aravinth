#!/bin/bash
# Sample Git workflow script

# Initialize a new repository
git init my-project
cd my-project

# Configure user details
git config user.name "Your Name"
git config user.email "you@example.com"

# Create a new file
echo "# My Project" > README.md

# Stage the file
git add README.md

# Commit the file
git commit -m "Initial commit with README"

# Create a new branch
git branch feature-branch
git checkout feature-branch

# Make changes in the branch
echo "Some new feature code" > feature.txt
git add feature.txt
git commit -m "Add feature file"

# Merge back into main
git checkout main
git merge feature-branch

# View history
git log --oneline --graph --decorate

