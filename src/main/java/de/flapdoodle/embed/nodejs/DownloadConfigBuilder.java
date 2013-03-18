package de.flapdoodle.embed.nodejs;

import de.flapdoodle.embed.process.extract.UUIDTempNaming;
import de.flapdoodle.embed.process.io.directories.UserHome;
import de.flapdoodle.embed.process.io.progress.StandardConsoleProgressListener;


public class DownloadConfigBuilder extends de.flapdoodle.embed.process.config.store.DownloadConfigBuilder {

	public DownloadConfigBuilder defaults() {
		fileNaming(new UUIDTempNaming());
		downloadPath("http://nodejs.org/dist/");
		progressListener(new StandardConsoleProgressListener());
		packageResolver(new NodejsPaths());
		artifactStorePath(new UserHome(".nodejs"));
		downloadPrefix("nodejs-download");
		userAgent("Mozilla/5.0 (compatible; Embedded node.js; +https://github.com/flapdoodle-oss/de.flapdoodle.embed.nodejs)");
		
		setOverride(true);
		return this;
	}

}
