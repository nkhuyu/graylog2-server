/**
 * This file is part of Graylog.
 *
 * Graylog is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Graylog is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Graylog.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.graylog2.restclient.models.api.requests;

import play.data.validation.Constraints;

/**
 * @author Lennart Koopmann <lennart@torch.sh>
 */
public class AddStaticFieldRequest extends ApiRequest {

    @Constraints.Required
    public String key;

    @Constraints.Required
    public String value;

    public AddStaticFieldRequest(String key, String value) {
        this.key = key;
        this.value = value;
    }

}
