package com.nick.software.link.linkcore.model.graph;

import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedSubgraph;

@NamedEntityGraph(
        name = "resume",
        attributeNodes = {
                @NamedAttributeNode(value = "username"),
                @NamedAttributeNode(value = "firstName"),
                @NamedAttributeNode(value = "lastName"),
                @NamedAttributeNode(value = "email"),
                @NamedAttributeNode(value = "accountDetails", subgraph = "resume-details")
        },
        subgraphs = {
                @NamedSubgraph(
                        name = "resume-details",
                        attributeNodes = {
                                @NamedAttributeNode("phone"),
                                @NamedAttributeNode("currentPosition"),
                                @NamedAttributeNode("biography"),
                                @NamedAttributeNode("technologies"),
                                @NamedAttributeNode("experiences"),
                        }
                )
        }
)
public @interface ResumeGraph {
}
