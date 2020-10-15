/**
 * Copyright 2020 - 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Daniel Krentzlin
 *
 */
public class Client {
	
	public static void runClient() {
		SmartphonePlug smartphonePlug = SmartphonePlug
				.getSmartphonePlug();

		// Example without adapter and a non type G smartphone plug

		System.out.println(
				"Example 1: Example without adapter and a non type G smartphone plug\n");

		boolean isTypeG = false;

		if (smartphonePlug.plugToTypeG(isTypeG)) {
			System.out.println("Smartphone can be recharged");
		} else {
			System.out.println(
					"You cannot plug a non type G plug to a type G socket.");
		}

		System.out.println("\n\n");

		// Example with adapter and a non type G smartphone plug
		System.out.println(
				"Example 2: Example with adapter and a non type G smartphone plug\n");

		boolean adapterIsPlugged = true;

		if (smartphonePlug.plugToTypeF(adapterIsPlugged)) {
			System.out.println("Smartphone can be recharged");
		} else {
			System.out.println(
					"Please, plug the socket adapter into type G socket");
		}
	}

}
