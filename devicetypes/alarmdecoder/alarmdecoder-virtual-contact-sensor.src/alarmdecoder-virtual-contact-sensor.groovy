/**
 *  Virtual Contact Sensor for alarm panel zones
 *
 *  Copyright 2016-2018 Nu Tech Software Solutions, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
metadata {
    definition (name: "AlarmDecoder virtual contact sensor", namespace: "alarmdecoder", author: "scott@nutech.com") {
        capability "Contact Sensor"
        capability "Refresh"
    }

    // tile definitions
    tiles {
        standardTile("sensor", "device.contact", width: 2, height: 2, canChangeIcon: true) {
            state "closed", label: '${name}', icon: "st.contact.contact.closed", backgroundColor: "#79b821"
            state "open", label: '${name}', icon: "st.contact.contact.open", backgroundColor: "#ffffff"
        }
        standardTile("refresh", "device.refresh", inactiveLabel: false, decoration: "flat") {
            state "default", label:'Refresh', action:"device.refresh", icon: "st.secondary.refresh-icon"
        }

        main "sensor"
        details(["sensor", "refresh"])
    }
}
