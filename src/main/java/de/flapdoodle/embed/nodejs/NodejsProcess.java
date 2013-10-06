/**
 * Copyright (C) 2011
 *   Michael Mosmann <michael@mosmann.de>
 *   Martin Jöhren <m.joehren@googlemail.com>
 *
 * with contributions from
 * 	konstantin-ba@github,Archimedes Trajano (trajano@github)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.flapdoodle.embed.nodejs;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import de.flapdoodle.embed.process.config.IRuntimeConfig;
import de.flapdoodle.embed.process.config.ISupportConfig;
import de.flapdoodle.embed.process.distribution.Distribution;
import de.flapdoodle.embed.process.extract.IExtractedFileSet;
import de.flapdoodle.embed.process.runtime.AbstractProcess;


public class NodejsProcess extends AbstractProcess<NodejsConfig, NodejsExecutable, NodejsProcess> {

	public NodejsProcess(Distribution distribution, NodejsConfig config, IRuntimeConfig runtime,
			NodejsExecutable nodejsExecutable) throws IOException {
		super(distribution,config,runtime,nodejsExecutable);
	}
	
	@Override
	protected void onBeforeProcessStart(ProcessBuilder processBuilder, NodejsConfig config, IRuntimeConfig runtimeConfig) {
		super.onBeforeProcessStart(processBuilder, config, runtimeConfig);
		
		processBuilder.directory(new File(config.getWorkingDirectory()));
	}
	
	@Override
	protected List<String> getCommandLine(Distribution distribution, NodejsConfig config, IExtractedFileSet exe) throws IOException {
		List<String> commandLine = new ArrayList<String>();
		commandLine.add(exe.executable().getAbsolutePath());
		commandLine.add(config.getFilename());
		commandLine.addAll(config.getParameters());
		return commandLine;
	}
	
	@Override
	protected ISupportConfig supportConfig() {
		return new NodejsSupportConfig();
	}

	@Override
	protected void stopInternal() {
		stopProcess();
	}

	@Override
	protected void cleanupInternal() {
		
	}
}
