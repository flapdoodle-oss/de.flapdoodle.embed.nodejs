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

import de.flapdoodle.embed.process.distribution.IVersion;

public enum NodejsVersion implements IVersion {
	V0_8_6("v0.8.6"),
	V0_8_8("v0.8.8"),
	V0_9_1_DEV("v0.9.1"),
	;

	private String version;

	private NodejsVersion(String sversion) {
		this.version = sversion;
	}

	@Override
	public String asInDownloadPath() {
		return version;
	}

	public static enum Main implements IVersion {
		V0_8(V0_8_8),
		V0_9_DEV(V0_9_1_DEV),
		;
		private final NodejsVersion _latest;

		Main(NodejsVersion latest) {
			_latest = latest;
		}

		@Override
		public String asInDownloadPath() {
			return _latest.asInDownloadPath();
		}

	}
}
