CREATE TABLE activities (id BIGINT AUTO_INCREMENT,
								start_time TIMESTAMP,
								activity_desc VARCHAR(255),
								activity_type VARCHAR(255),
								PRIMARY KEY (id));

CREATE TABLE track_points(id BIGINT AUTO_INCREMENT,
                          act_time Date,
                            lat DOUBLE,
                            lon DOUBLE,
                            activityId BIGINT,
                            PRIMARY KEY (id),
                            FOREIGN KEY (activityId) REFERENCES activities(id));

INSERT INTO activities(start_time, activity_desc, activity_type) values ('2021-03-15 20:23', 'Biking in Bugac', 'BIKING');
INSERT INTO activities(start_time, activity_desc, activity_type) values ('2021-07-19 22:58', 'Runnung in Bugac', 'RUNNING');
INSERT INTO activities(start_time, activity_desc, activity_type) values ('2020-03-28 16:30', 'Hiking in Tátra', 'HIKING');