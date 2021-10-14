/*
 * MCDocker, an open source Minecraft launcher.
 * Copyright (C) 2021 MCDocker
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package io.mcdocker.launcher.content.mods;

import io.mcdocker.launcher.content.Filter;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ModProvider<FILTER extends Filter, MOD extends Mod<ModManifest>> {

    CompletableFuture<List<ModDetails<MOD>>> getMods(FILTER filter);
    default CompletableFuture<List<ModDetails<MOD>>> getMods() {
        return getMods(null);
    }
    CompletableFuture<ModDetails<MOD>> getMod(String id);

}
