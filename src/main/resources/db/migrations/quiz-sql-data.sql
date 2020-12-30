USE quiz_angular;

# Table Chapter
INSERT INTO `chapter` VALUES (1,'Seus Dados'),(2,'Principal');

#Table Ask
INSERT INTO `ask` VALUES (1,'Cidade','','input',1),(2,'Sexo','','one-select',1),(3,'Cite as 2 Principais Marcas',NULL,'multi-select',2),(4,'Quais Gosta?',NULL,'loop',2),(5,'Qual a sua idade?','','input-number',2);

#Table Answer
INSERT INTO `answer` VALUES (1,'Masculino',0,2),(2,'Feminino',0,2),(3,'Outro',0,2),(5,'Coca-cola',0,3),(6,'Fanta',0,3),(18,'Doly',0,3),(20,'Doritos',0,3);
