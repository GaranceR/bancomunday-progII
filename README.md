# Reminder

## Git worklow

### best practices

*based on https://about.gitlab.com/2016/07/27/the-11-rules-of-gitlab-flow/*

* **Use feature branches, no direct commits on master.**

> When using Git you should create a branch for whatever you’re working on, so that you end up doing a code review before you merge.

* **Test all commits (if possible), not only ones on master.**


* **Perform code reviews before merges into master, not afterwards.**

> Don't test everything at the end of your week. Do it on the spot, because you'll be more likely to catch things that could cause problems and others will also be working to come up with solutions.

* **Pushed commits are never rebased.**

> If you push to a public branch you shouldn't rebase it since that makes it hard to follow what you're improving, what the test results were, and it breaks cherrypicking. We sometimes sin against this rule ourselves when we ask a contributor to squash and rebase at the end of a review process to make something easier to revert. But in general the guideline is: code should be clean, history should be realistic.

* **Everyone starts from master, and targets master.**

> This means you don’t have any long branches. You check out master, build your feature, create your merge request, and target master again. You should do your complete review before you merge, and not have any intermediate stages.


* **Commit messages reflect intent.**

> You should not only say what you did, but also why you did it. It’s even more useful if you explain why you did this over any other options.

### Useful commands

```bash
########
# Basics
########

git clone url                 # cloning a remote repo to your machine
git status                    # showing git status
git add file                  # adding a file to your Commit
git commit -m "my message"    # Commit your changes and adding a message
git push                      # Pushing your commits to the remote repo

###################################
# Create a new branch off of master
###################################

git checkout master       # Switch to master
git pull                  # Get changes from master
git checkout -b kk_lasers # Create a new branch kk_lasers
git push kk_lasers        # Pushing your empty branch to the remote Github Repo

##############
# Add a commit
##############

git add this_file
git commit -m "Add this_file"
git push kk_lasers

#######################################################
# Get the latest changes off of master whenever needed
#######################################################

git checkout master     # switching to the branch master
git pull                # get changes from master
git checkout kk_lasers  # switching to your branch kk_lasers
git rebase master       # rebase your branch regarging master
git push -f kk_lasers   # pushing new changes to your branch (using the FORCE)
```
