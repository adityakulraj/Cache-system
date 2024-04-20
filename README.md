You are required to implement an in-memory cache module/library which you will embed in your application to improve the application performance, by holding heavily accessed (read/written) application specific objects. To start, we would begin with following minimal requirements.

Your cache module should be generic, re-usable and easy to integrate across various modules within your production/organization.

The cache will be bounded by a fixed capacity (number of items) for holding the objects, which will be mentioned during early initialization of the p program.

Upon hitting the capacity, the cache module can invoke one of various cache eviction strategies to make room for newer objects. You are required to incorporate cache eviction in your code to handle aforementioned condition.

You could choose to implement various cache eviction strategies such as 'Least recently used', 'Least frequently used', 'time based expiration'et.al

In one of our unique use cases, we would like to change the eviction policy of the cache during runtime and the cache should start evicting keys based on the new eviction policy set.

