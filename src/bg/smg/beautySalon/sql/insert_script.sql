/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  n.m.borisova
 * Created: Dec 19, 2023
 */

INSERT INTO `category`(`categoryName`) VALUES ('коса');
INSERT INTO `category`(`categoryName`) VALUES ('нокти');
INSERT INTO `category`(`categoryName`) VALUES ('мигли');
INSERT INTO `category`(`categoryName`) VALUES ('лазерна епилация');
INSERT INTO `category`(`categoryName`) VALUES ('лице');


INSERT INTO `procedure`( `procedureName`, `categoryID`, `price`) VALUES ('женско подстригване','1','50');
INSERT INTO `procedure`( `procedureName`, `categoryID`, `price`) VALUES ('мъжко подстригване','1','30');
INSERT INTO `procedure`( `procedureName`, `categoryID`, `price`) VALUES ('боядисване','1','70');
INSERT INTO `procedure`( `procedureName`, `categoryID`, `price`) VALUES ('официална прическа','1','60');
INSERT INTO `procedure`( `procedureName`, `categoryID`, `price`) VALUES ('четка и сешоар','1','60');
INSERT INTO `procedure`( `procedureName`, `categoryID`, `price`) VALUES ('кератиова терапия','1','100');
INSERT INTO `procedure`( `procedureName`, `categoryID`, `price`) VALUES ('кичури','1','110');
INSERT INTO `procedure`( `procedureName`, `categoryID`, `price`) VALUES ('перманентно къдрене','1','150');
INSERT INTO `procedure`( `procedureName`, `categoryID`, `price`) VALUES ('перманентно изправяне','1','150');

INSERT INTO `procedure`(`procedureName`, `categoryID`, `price`) VALUES ('френски маикюр','2','60');
INSERT INTO `procedure`(`procedureName`, `categoryID`, `price`) VALUES ('гел лак','2','55');
INSERT INTO `procedure`(`procedureName`, `categoryID`, `price`) VALUES ('изграждане','2','90');
INSERT INTO `procedure`(`procedureName`, `categoryID`, `price`) VALUES ('укрепване','2','10');
INSERT INTO `procedure`(`procedureName`, `categoryID`, `price`) VALUES ('мъжки маникюр','2','25');
INSERT INTO `procedure`(`procedureName`, `categoryID`, `price`) VALUES ('арт маникюр','2','100');
INSERT INTO `procedure`(`procedureName`, `categoryID`, `price`) VALUES ('педикюр','2','65');
INSERT INTO `procedure`(`procedureName`, `categoryID`, `price`) VALUES ('сваляне на гел лак','2','30');

INSERT INTO `procedure`(`procedureName`, `categoryID`, `price`) VALUES ('мигла по мигла','3','150');
INSERT INTO `procedure`(`procedureName`, `categoryID`, `price`) VALUES ('руски обем','3','100');
INSERT INTO `procedure`(`procedureName`, `categoryID`, `price`) VALUES ('ламиниране на мигли','3','120');


-- 
-- INSERT INTO `procedure`(`procedureName`, `date`, `price`) VALUES ('подстрижка','2024-01-25-10-00','30');
-- INSERT INTO `procedure`(`procedureName`, `date`, `price`) VALUES ('подстрижка','2024-01-25-11-00','30');
-- INSERT INTO `procedure`(`procedureName`, `date`, `price`) VALUES ('подстрижка','2024-01-25-12-00','30');
-- INSERT INTO `procedure`(`procedureName`, `date`, `price`) VALUES ('подстрижка','2024-01-25-14-00','30');
-- INSERT INTO `procedure`(`procedureName`, `date`, `price`) VALUES ('маникюр','2024-01-25-08-00','50');
-- INSERT INTO `procedure`(`procedureName`, `date`, `price`) VALUES ('маникюр','2024-01-25-09-00','50');
-- INSERT INTO `procedure`(`procedureName`, `date`, `price`) VALUES ('маникюр','2024-01-25-10-00','50');
-- INSERT INTO `procedure`(`procedureName`, `date`, `price`) VALUES ('маникюр','2024-01-25-11-00','50');
-- INSERT INTO `procedure`(`procedureName`, `date`, `price`) VALUES ('маникюр','2024-01-26-08-00','50');
-- INSERT INTO `procedure`(`procedureName`, `date`, `price`) VALUES ('маникюр','2024-01-26-09-00','50');
-- INSERT INTO `procedure`(`procedureName`, `date`, `price`) VALUES ('маникюр','2024-01-26-10-00','50');
-- INSERT INTO `procedure`(`procedureName`, `date`, `price`) VALUES ('маникюр','2024-01-27-08-00','50');
-- INSERT INTO `procedure`(`procedureName`, `date`, `price`) VALUES ('маникюр','2024-01-27-09-00','50');