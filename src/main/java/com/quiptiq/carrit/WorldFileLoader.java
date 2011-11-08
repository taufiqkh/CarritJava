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
    public static ChunkWorld loadWorld(String mapName) {
        return new chunk_world().loadChunkWorld(mapName);
    }

    public static void main(String [] args) {
        if (args.length == 1) {
            ChunkWorld world = loadWorld(args[0]);
            System.out.println("Has chunk? " + world.hasChunk(0, 0, 0));
            Chunk testChunk = world.getChunk(0, 0, 0);

            int numBytes = world.getChunkSizeX() * world.getChunkSizeY() * world.getChunkSizeZ();
            System.out.println("Got chunk, " + numBytes + ":");

            byte[] blockIds = testChunk.getBlockIds();
            for (int x = 0; x < world.getChunkSizeX(); x++) {
                for (int z = 0; z < world.getChunkSizeZ(); z++) {
                    StringBuilder builder = new StringBuilder(world.getChunkSizeY());
                    for (int y = 0; y < world.getChunkSizeY(); y++) {
                        builder.append(blockIds[y + z * world.getChunkSizeY() + x * world.getChunkSizeY() * world.getChunkSizeZ() ]);
                    }
                    System.out.println(x + "," + z + ":" + builder.toString());
                }
            }
        }
    }
}
