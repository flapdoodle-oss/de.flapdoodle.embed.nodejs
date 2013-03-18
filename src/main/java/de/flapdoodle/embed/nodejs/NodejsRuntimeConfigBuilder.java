package de.flapdoodle.embed.nodejs;

import de.flapdoodle.embed.process.config.RuntimeConfigBuilder;
import de.flapdoodle.embed.process.config.io.ProcessOutput;
import de.flapdoodle.embed.process.runtime.ICommandLinePostProcessor;


public class NodejsRuntimeConfigBuilder extends RuntimeConfigBuilder {

	public NodejsRuntimeConfigBuilder defaults() {
		processOutput(ProcessOutput.getDefaultInstance("nodejs"));
		commandLinePostProcessor(new ICommandLinePostProcessor.Noop());
		artifactStore(new ArtifactStoreBuilder().defaults());
		setOverride(true);
		return this;
	}
}
