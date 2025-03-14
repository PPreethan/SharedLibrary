def GitDownload(repo)
{
  git "https://github.com/IntelliqDevops/${repo}.git"
}

def MavenBuild()
{
  sh "mvn package"
}
def depoy(jobname,ip,context_path)
{
  sh "scp -o /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context_path}.war"
}
