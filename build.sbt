name := "travis-test-scala"

scalaVersion := "2.11.7"

publishMavenStyle := true

organization := "org.github.bcolyn.travis-test-scala"

publishTo := {
  if (isSnapshot.value)
    // see travis-test-java, got no snapshots repo
    //Some("snapshots" at "https://my.artifact.repo.net/" + "content/repositories/snapshots")
    Some(Resolver.file("file", new File( "target/repository" )))
  else
    Some("releases"  at "https://api.bintray.com/maven/bcolyn/releases/travis-test-scala/;publish=1")
}

//bintray
credentials += Credentials("Bintray API Realm", "api.bintray.com",
  sys.props.getOrElse("RELEASE_DEPLOY_USERNAME",""),
  sys.props.getOrElse("RELEASE_DEPLOY_PASSWORD",""))

//add other credentials below (nexus or jfrog)