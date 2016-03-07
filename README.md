How to release
==============

* tag a commit with a tag name of "release-x.y.z" and push the tag
* travis goes to town
in parallel:
* bump the snapshot version (in version.sbt) to the next desired dev version

refs:
http://szimano.org/automatic-deployments-to-jfrog-oss-and-bintrayjcentermaven-central-via-travis-ci-from-sbt/
