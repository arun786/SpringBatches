package com.arun.partition;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

public class MyPartitioner implements Partitioner {

	@Override
	public Map<String, ExecutionContext> partition(int gridSize) {

		Map<String, ExecutionContext> partitionMap = new HashMap<String, ExecutionContext>();
		int startIndex = 0;
		int endIndex = 5;

		for (int i = 0; i < gridSize; i++) {
			ExecutionContext ctx = new ExecutionContext();
			ctx.putInt("startingIndex", startIndex);
			ctx.put("endingIndex", endIndex);

			startIndex = startIndex + 1;
			endIndex += 5;

			partitionMap.put("Thread: - " + i, ctx);
		}
		return partitionMap;
	}

}
