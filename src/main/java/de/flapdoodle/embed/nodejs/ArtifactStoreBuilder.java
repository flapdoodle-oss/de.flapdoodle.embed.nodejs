package de.flapdoodle.embed.nodejs;

import de.flapdoodle.embed.process.extract.UUIDTempNaming;
import de.flapdoodle.embed.process.io.directories.PropertyOrPlatformTempDir;

public class ArtifactStoreBuilder extends de.flapdoodle.embed.process.store.ArtifactStoreBuilder {

	public ArtifactStoreBuilder defaults() {
		tempDir(new PropertyOrPlatformTempDir());
		executableNaming(new UUIDTempNaming());
		download(new DownloadConfigBuilder().defaults());
		setOverride(true);
		return this;
	}
}
