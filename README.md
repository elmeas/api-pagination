# Interview Task: Implement Pagination for a Large Dataset API

## Instructions:
1. Clone the following repository to your local machine:
    - [GitHub Repository](https://github.com/elmeas/api-pagination)
2. Build and start the environment:
   ```bash
   docker-compose up --build
   
3. Follow the instructions to set up the API and database environment. Ensure the API runs correctly before starting the implementation.

## Core Task: Implement Pagination for Large Datasets
- Implement offset-based pagination for an API endpoint that retrieves data from a large dataset (10k records). The pagination should use query parameters such as `limit` and `offset` (e.g., `GET /hello?limit=20&offset=100`).
- Optimize your implementation to handle large datasets efficiently and return results within a reasonable timeframe.

### Expectations:
- Ensure the database queries are optimized for large datasets (e.g., add appropriate indexing).
- Write clean, maintainable code with unit tests to validate the pagination functionality.

## Bonus Task:
- Implement **cursor-based pagination** in addition to offset-based pagination. Cursor-based pagination is more efficient for handling large datasets and can be beneficial in high-performance systems.
- Add **real-time filtering** capabilities, allowing users to filter results dynamically based on fields such as name and id.
- Implement **sorting functionality** that works alongside pagination and filtering (e.g., allow sorting by price, date, or name).

### Example Steps:

