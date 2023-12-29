-- Create BlogPost table
CREATE TABLE blog_posts (
    post_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    content VARCHAR(1000)
);

-- Create Comment table
CREATE TABLE comments (
    comment_id INT AUTO_INCREMENT PRIMARY KEY,
    text VARCHAR(255),
    post_id INT,
    FOREIGN KEY (post_id) REFERENCES blog_posts(post_id)
);

-- Insert sample data
INSERT INTO blog_posts (title, content) VALUES ('Post 1', 'Content of Post 1');
INSERT INTO blog_posts (title, content) VALUES ('Post 2', 'Content of Post 2');
INSERT INTO blog_posts (title, content) VALUES ('Post 3', 'Content of Post 3');

-- Insert comments for Post 1
INSERT INTO comments (text, post_id) VALUES ('Comment 1 for Post 1', 1);
INSERT INTO comments (text, post_id) VALUES ('Comment 2 for Post 1', 1);
INSERT INTO comments (text, post_id) VALUES ('Comment 3 for Post 1', 1);

-- Insert comments for Post 2
INSERT INTO comments (text, post_id) VALUES ('Comment 1 for Post 2', 2);
INSERT INTO comments (text, post_id) VALUES ('Comment 2 for Post 2', 2);
INSERT INTO comments (text, post_id) VALUES ('Comment 3 for Post 2', 2);

-- Insert comments for Post 3
INSERT INTO comments (text, post_id) VALUES ('Comment 1 for Post 3', 3);
INSERT INTO comments (text, post_id) VALUES ('Comment 2 for Post 3', 3);
INSERT INTO comments (text, post_id) VALUES ('Comment 3 for Post 3', 3);