// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupState extends com.pulumi.resources.ResourceArgs {

    public static final GroupState Empty = new GroupState();

    /**
     * The creation date of the group.
     * 
     */
    @Import(name="created")
    private @Nullable Output<String> created;

    /**
     * @return The creation date of the group.
     * 
     */
    public Optional<Output<String>> created() {
        return Optional.ofNullable(this.created);
    }

    /**
     * The ID of the created group.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<Integer> groupId;

    /**
     * @return The ID of the created group.
     * 
     */
    public Optional<Output<Integer>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * The desired name of the group.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The desired name of the group.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GroupState() {}

    private GroupState(GroupState $) {
        this.created = $.created;
        this.groupId = $.groupId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupState $;

        public Builder() {
            $ = new GroupState();
        }

        public Builder(GroupState defaults) {
            $ = new GroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param created The creation date of the group.
         * 
         * @return builder
         * 
         */
        public Builder created(@Nullable Output<String> created) {
            $.created = created;
            return this;
        }

        /**
         * @param created The creation date of the group.
         * 
         * @return builder
         * 
         */
        public Builder created(String created) {
            return created(Output.of(created));
        }

        /**
         * @param groupId The ID of the created group.
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<Integer> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The ID of the created group.
         * 
         * @return builder
         * 
         */
        public Builder groupId(Integer groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param name The desired name of the group.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The desired name of the group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GroupState build() {
            return $;
        }
    }

}
