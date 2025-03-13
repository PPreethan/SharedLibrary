def GitDownload(repo)
{
  git "https://github.com/IntelliqDevops/${repo}.git"
}

def MavenBuild()
{
  sh 'mvn package'
}
