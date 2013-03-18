# Organisation Flapdoodle OSS

We are now a github organisation. You are invited to participate.

# Embedded node.js

Embedded node.js will provide a platform neutral way for running node binary in unittests.


## Why?

- its easy, much easier as installing right version by hand
- you can change version per test

## Howto

### Maven

Stable (Maven Central Repository, Released: 18.03.2013 - wait 24hrs for [maven central](http://repo1.maven.org/maven2/de/flapdoodle/embed/de.flapdoodle.embed.nodejs/maven-metadata.xml))

	<dependency>
		<groupId>de.flapdoodle.embed</groupId>
		<artifactId>de.flapdoodle.embed.nodejs</artifactId>
		<version>1.27</version>
	</dependency>

Snapshots (Repository http://oss.sonatype.org/content/repositories/snapshots)

	<dependency>
		<groupId>de.flapdoodle.embed</groupId>
		<artifactId>de.flapdoodle.embed.nodejs</artifactId>
		<version>1.28-SNAPSHOT</version>
	</dependency>

### Changelog

Initial Version starts with 1.19 SNAPSHOT as extract from Embedded MongoDB Project

#### 1.28 (SNAPSHOT)



#### 1.27

- api change upgrade (de.flapdoodle.embed.process api change)
- added support for nodejs 0.10.0

#### 1.26

- dep version change

#### 1.25

- dep version change

#### 1.24

- dep version change

#### 1.23

- added v0.8.8, v0.9.1 (Unstable)

#### 1.22

#### 1.21

- maven version range disabled

#### 1.20

- more customization, minor bugfixes

#### 1.19

- initial cut out

#### 1.18

### Supported Versions

Versions: 0.8.6, any custom
Support for Linux, Windows and MacOSX.

### Usage

#### Running javascript from junit test with node.js

	public void testNodejs() throws IOException, InterruptedException {
		final File helloWorld = Files.createTempFile("node-hello-world.js");
		Files.write("console.log(\"Running Hello World inside NodeJS in \"+process.cwd());setTimeout(function(){},1000);", helloWorld);
		try {
			Nodejs.call(NodejsVersion.Main.V0_8, helloWorld.getAbsolutePath(), System.getProperty("java.io.tmpdir"));
		} finally {
			Files.forceDelete(helloWorld);
		}
	}



