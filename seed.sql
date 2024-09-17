-- seed.sql
CREATE TABLE IF NOT EXISTS users (
                                     id SERIAL PRIMARY KEY,
                                     name VARCHAR(100),
                                     age INT
);

-- Function to insert data in batches
DO $$
    BEGIN
        FOR i IN 1..100 LOOP
                INSERT INTO users (name, age)
                SELECT
                    'User' || ((i - 1) * 100 + generate_series(1, 100)),  -- Create usernames in batches
                    (RANDOM() * (50 - 18) + 18)::INT                      -- Random age between 18 and 50
                FROM generate_series(1, 100);
            END LOOP;
    END $$;
