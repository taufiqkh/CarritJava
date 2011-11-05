package com.quiptiq.carrit;

import carrit.chunk_world;

/**
 * Java API class for the carrit chunk manager.
 *
 * @author Taufiq Hoven
 */
public class ChunkWorld {
    /**
     * Chunk world that is being wrapped.
     */
    private final chunk_world world;

    /**
     * Create a new chunk manager for the specified world.
     *
     * @param worldName
     *            Name of the world to manage.
     */
    public ChunkWorld(String worldName) {
        world = new chunk_world(worldName);
    }

    /**
     * Determine whether or not the chunk at the specified coordinates has been
     * generated and is currently managed.
     *
     * @param x
     *            X coordinate of the chunk.
     * @param y
     *            Y coordinate of the chunk.
     * @param z
     *            Z coordinate of the chunk.
     * @return True if the chunk has been generated and is currently under
     *         management, otherwise false.
     */
    public boolean hasChunk(int x, int y, int z) {
        return world.hasChunk(x, y, z);
    }

    /**
     * Gets the chunk at the specified coordinates, if it exists in management.
     *
     * @param x
     *            X coordinate of the chunk.
     * @param y
     *            Y coordinate of the chunk.
     * @param z
     *            Z coordinate of the chunk.
     * @return The chunk at the specified coordinates, or null if the chunk does
     *         not yet exist under management.
     */
    public int getChunk(int x, int y, int z) {
        world.getChunk(x, y, z);
        return 0;
    }
}
