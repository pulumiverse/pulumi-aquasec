// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationState extends com.pulumi.resources.ResourceArgs {

    public static final NotificationState Empty = new NotificationState();

    /**
     * The user that created the notification
     * 
     */
    @Import(name="author")
    private @Nullable Output<String> author;

    /**
     * @return The user that created the notification
     * 
     */
    public Optional<Output<String>> author() {
        return Optional.ofNullable(this.author);
    }

    /**
     * Notification last update time
     * 
     */
    @Import(name="lastUpdated")
    private @Nullable Output<String> lastUpdated;

    /**
     * @return Notification last update time
     * 
     */
    public Optional<Output<String>> lastUpdated() {
        return Optional.ofNullable(this.lastUpdated);
    }

    /**
     * Notification name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Notification name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Notification properties, please check the examples for setting it
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    /**
     * @return Notification properties, please check the examples for setting it
     * 
     */
    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Notification Template
     * 
     */
    @Import(name="template")
    private @Nullable Output<Map<String,String>> template;

    /**
     * @return Notification Template
     * 
     */
    public Optional<Output<Map<String,String>>> template() {
        return Optional.ofNullable(this.template);
    }

    /**
     * Notifications types, allowed values: slack\ jira\ email\ teams\ webhook\ splunk\ serviceNow
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Notifications types, allowed values: slack\ jira\ email\ teams\ webhook\ splunk\ serviceNow
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private NotificationState() {}

    private NotificationState(NotificationState $) {
        this.author = $.author;
        this.lastUpdated = $.lastUpdated;
        this.name = $.name;
        this.properties = $.properties;
        this.template = $.template;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationState $;

        public Builder() {
            $ = new NotificationState();
        }

        public Builder(NotificationState defaults) {
            $ = new NotificationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param author The user that created the notification
         * 
         * @return builder
         * 
         */
        public Builder author(@Nullable Output<String> author) {
            $.author = author;
            return this;
        }

        /**
         * @param author The user that created the notification
         * 
         * @return builder
         * 
         */
        public Builder author(String author) {
            return author(Output.of(author));
        }

        /**
         * @param lastUpdated Notification last update time
         * 
         * @return builder
         * 
         */
        public Builder lastUpdated(@Nullable Output<String> lastUpdated) {
            $.lastUpdated = lastUpdated;
            return this;
        }

        /**
         * @param lastUpdated Notification last update time
         * 
         * @return builder
         * 
         */
        public Builder lastUpdated(String lastUpdated) {
            return lastUpdated(Output.of(lastUpdated));
        }

        /**
         * @param name Notification name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Notification name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param properties Notification properties, please check the examples for setting it
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Notification properties, please check the examples for setting it
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param template Notification Template
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<Map<String,String>> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template Notification Template
         * 
         * @return builder
         * 
         */
        public Builder template(Map<String,String> template) {
            return template(Output.of(template));
        }

        /**
         * @param type Notifications types, allowed values: slack\ jira\ email\ teams\ webhook\ splunk\ serviceNow
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Notifications types, allowed values: slack\ jira\ email\ teams\ webhook\ splunk\ serviceNow
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public NotificationState build() {
            return $;
        }
    }

}