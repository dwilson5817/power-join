/*
 * Power Join
 * Copyright (C) 2021  Dylan Wilson
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
 *
 */

package dev.dylanwilson.plugins;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class PowerJoin extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getLogger().info(ChatColor.GREEN + this.getName() + " has been enabled!");
    }

    @Override
    public void onDisable() {
        this.getLogger().info(ChatColor.GREEN + this.getName() + " has been disabled!");
    }
}
