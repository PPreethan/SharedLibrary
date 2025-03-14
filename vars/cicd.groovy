def GitDownload(repo)
{
  git "https://github.com/IntelliqDevops/${repo}.git"
}

def MavenBuild()
{
  sh "mvn package"
}
def deploy(environment, server, context)
{
  sh "scp -o /var/lib/jenkins/workspace/${environment}/webapp/target/webapp.war ubuntu@${server}:/var/lib/tomcat10/webapps/${context}.war"
}
