package com.quiptiq.carrit;

import carrit.chunk_world;

/**
 * Loads a world from a file.

 * @author Taufiq Hoven
 */
public class WorldFileLoader {
    /**
     * Loads the world contained in the map with the specified name.
     *
     * @param mapName
     *            Name of the map.
     * @return ChunkWorld at the specified map, or null if non exists.
     */
    public static ChunkWorld LoadWorld(String mapName) {
        return new chunk_world().loadChunkWorld(mapName);
    }
}
