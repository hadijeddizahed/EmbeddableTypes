# EmbeddableTypes in Hibernate

## What happen if we use multiple same embeddable type in an entity? 

Of course it doesn't work! because the table databsae couldn't has duplicate columns name. 
JPA defines the ```@AttributeOverride``` annotation for handdle this senario. 
