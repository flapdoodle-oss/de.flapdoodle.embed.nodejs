# Organisation Flapdoodle OSS

We are now a github organisation. You are invited to participate.

# Embedded node.js

Embedded node.js will provide a platform neutral way for running node binary in unittests.


## Why?

- its easy, much easier as installing right version by hand
- you can change version per test

## Howto

### Maven

Stable (Maven Central Repository, Released: 16.08.2012 - wait 24hrs for [maven central](http://repo1.maven.org/maven2/de/flapdoodle/embed/de.flapdoodle.embed.nodejs/maven-metadata.xml))

	<dependency>
		<groupId>de.flapdoodle.embed</groupId>
		<artifactId>de.flapdoodle.embed.nodejs</artifactId>
		<version>1.22</version>
	</dependency>

Snapshots (Repository http://oss.sonatype.org/content/repositories/snapshots)

	<dependency>
		<groupId>de.flapdoodle.embed</groupId>
		<artifactId>de.flapdoodle.embed.nodejs</artifactId>
		<version>1.23-SNAPSHOT</version>
	</dependency>

### Changelog

Initial Version starts with 1.19 SNAPSHOT as extract from Embedded MongoDB Project

#### 1.21 (SNAPSHOT)

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

 NOT DOCUMENTED


