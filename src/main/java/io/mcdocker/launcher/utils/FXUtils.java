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

package io.mcdocker.launcher.utils;

import javafx.application.Platform;
import javafx.scene.Node;

import java.util.function.Consumer;

public class FXUtils {

    public static <T extends Node> void editNode(T node, Consumer<T> consumer) {
        editFx(() -> consumer.accept(node));
    }

    public static void editFx(Runnable runnable) {
        Platform.runLater(runnable);
    }

}
