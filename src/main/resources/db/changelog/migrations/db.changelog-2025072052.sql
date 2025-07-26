--liquibase formatted sql
--changeset ibiapino:202507201741
--comment: set unblock_reason nullable

ALTER TABLE board.blocks MODIFY COLUMN unblock_reason VARCHAR(255) NULL;

--rollback ALTER TABLE board.blocks MODIFY COLUMN unblock_reason VARCHAR(255) NULL;
