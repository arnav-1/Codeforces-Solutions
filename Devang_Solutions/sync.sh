#!/bin/bash

# 1. Get the latest from the original repo
echo "Fetching from upstream..."
git fetch upstream

# 2. Merge upstream changes into your local main
echo "Merging upstream/main..."
git checkout main
git merge upstream/main

# 3. Update your GitHub fork
echo "Pushing updates to your origin fork..."
git push origin main

echo "Done! Your fork is now perfectly in sync."