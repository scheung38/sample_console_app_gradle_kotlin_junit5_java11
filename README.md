# README.md

Remove directory from git but NOT local
As mentioned in the comments, what you usually want to do is remove this directory from git but not delete it entirely from the filesystem (local)

In that case use:

git rm -r --cached myFolder

https://stackoverflow.com/questions/6313126/how-to-remove-a-directory-from-git-repository