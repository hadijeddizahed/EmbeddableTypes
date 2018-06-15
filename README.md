# EmbeddableTypes in Hibernate

## What happen if we use multiple same embeddable type in an entity? 

Of course it doesn't work!(`org.hibernate.MappingException: Repeated column in mapping for entity:YOUR_ENTITY`) because the table databsae couldn't has duplicate columns name. 
JPA defines the ```@AttributeOverride``` annotation for handdle this senario. 

`@AttributeOverrides({
        @AttributeOverride(
                name = "embeddableType.propertyName",
                column = @Column(name = "new name")
        ),
        //override other columns name ...
})`
