
## Angular CLI App

Web Application

## Setup
### Install Scoop on Windows via PowerShell
```powershell
PS> $wc = new-object net.webclient
PS> $wc.Proxy.Credentials = [System.Net.CredentialCache]::DefaultNetworkCredentials
PS> iex $wc.downloadstring('https://get.scoop.sh')
```

### Install Node, NVM, Yarn, Git and other misc utilities using Scoop command
```bash
scoop install nodejs nvm
scoop install yarn
scoop install openssh git
scoop install sudo
sudo npm install --global --production windows-build-tools
``` 

## How to create a new Angular project using Angular CLI
```bash
npx -p @angular/cli ng new search-ui
```
## Create Angular project with specific Angular version
```bash
npx -p @angular/cli@5 ng new hello-world
npx -p @angular/cli@6 ng new hello-world
npx -p @angular/cli@7 ng new hello-world
npx -p @angular/cli@10 ng new hello-world
``` 
If all the installations worked, you should be ready to go.
```bash
yarn install
yarn run start
```
