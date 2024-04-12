### Cloning a repository

- go to **Code** (top right corner) > **HTTPS** (default choice) > **Copy url to clipboard** (button on the right)
- open **Git bash** (or Terminal) on your computer
- move to a directory of your choice (or stay in the default working directory) and type:  **git clone [paste link]**
  - in this case:  **git clone https://github.com/ZrinkaCvitanovic/OOP_Lectures_2803.git**
- a new folder in your working directory will be created with all files in it
- if there where some changes in repository, you don't need to delete it and clone again
- you can perform **git pull** and the changes will be visible
  - if it throws an an error that's because git does not know where to pull changes from
  - you have to add an URL of the origin of the target repository: **git remote add [URL]**   
-------------------------------------------------------------------------------------------------
This is all you have to do to have this code locally and try it out. The rest of this file servers for a future reference when you start using git as developers.

### Contributing to a repository
- GitHub is a tool you'll use in the future for collaborative coding
- your team will create a repository and each of you will upload their progress (or as we say _contribute to the repository_)
- contributing works as follows:
  - clone the repository if not already
  - open the repostory directory from your terminal or IDE
  - your can either change an exisiting file or create a new one
  - make sure that file is in the correct directory
  - use Terminal from your IDE or open Git bash
    - add the file to git: **git add [filename]** -> this command lets git know that it needs to monitor this file and all changes that happen to it from your computer
    - you can also add all files with this command: **git add .**
    - once you have finished with all the changes, type: **git commit -m "insert a message between quotes"**
    - commit lets git know that you are done with all the changes and you wish to save them
    - a message is used to let others know briefly what you have changed (and you cannot commit without a message)
    - you can make multiple commits, but one of them will be visible in a remote repository until you type **git push**
  - the first time you do this you might get an error; that's because git does not know the URL of the remote repository you have cloned (or as we say, it does not know the _origin_ of your repository)
  - you have to add an URL of the origin of the target repository: **git remote add [URL]**  
    (for example **git remote add https://github.com/ZrinkaCvitanovic/OOP_Lectures_2803.git)**
  - after this step, type **git push** once again
  - visit the repository on GitHub page and see if your commit is visible

### Creating branhces
- quite often you'll encounter complex apps that have lots of files and contributiors
- git manages this by introducing _branches_
- there is initially one branch (_main/master_) and in the end only the code in this branch is distributed in public so all relevant changes need to be there
- sometimes you'll want to experiment with something and try something new, but you don't want to mess up the code in the main branch (because normally that code is in production)
- that's when you create your own branch -> think of it as an isolated copy of the main code where you can try to add or change something
- if your attemp fails, you can just delete your branch
- if it turns out okay, you can _merge_ it with master/main branch (this part is usually done from GitHub page)
- merging means adding your changes to the main/master branch
- you can create your own branch by typing in terminal: **git branch [branch name]** 
    - keep in mind that this branch is derived from the branch you were currently on
    - typically you'll want to derive branches from _main_ so make sure that's the branch you are on before performing this step
    - checking your current branch: **git branch**
    - changing your branch: **git checkout [branch]** (for example git checkout master)
    - once you are on the correct branch, you can perform steps from "Contributing to a repository"
    - your commits will only be visible from the branch that performed the push
      - for example, let's assume you have created a branch _b1_, committed and pushed some changes from there
      - if you switch to master branch (**git checkout master**) or visit GitHub and change branch to _master_, you won't see this change (at least until you merge those two branches)
      - however, if you visit GitHub and change branch to _b1_, you'll see your commit with all the changes
