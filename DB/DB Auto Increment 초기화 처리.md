# DB Auto Increment 초기화 처리

🤔 id 를 1부터 다시 초기화 시키고 싶다면?
```sql
ALTER TABLE `online_payment` AUTO_INCREMENT = 1;
SET @COUNT = 0;
UPDATE `online_payment` SET online_payment_seq = @COUNT:=@COUNT+1 WHERE payment_status = 1;
```
🤔 id 를 12부터 시작하고 싶다면?
```sql
ALTER TABLE `online_payment` AUTO_INCREMENT = 12;
SET @COUNT = 0;
UPDATE `online_payment` SET online_payment_seq = @COUNT:=@COUNT+12 WHERE payment_status = 12;
```
