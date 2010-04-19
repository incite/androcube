# AndroCube

## Overview

Android client for Toolbox.

## Notes

### Build errors

If you get these:

Project 'androcube' is missing required source folder
The project cannot be built until build path errors are resolved

Do this:

The resolution was to force a resave of the selected projects (and their .classpath files):
 * Open the project properties
 * Select Java Build Path > Libraries
 * Add a new, arbitrary library (to be deleted later) > OK
 * Wait for the workspace to refresh (or force a refresh of the project)
 * The error(s) will go away
 * Remove the dummy library

